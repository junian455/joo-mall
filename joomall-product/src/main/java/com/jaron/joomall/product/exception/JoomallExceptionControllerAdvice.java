package com.jaron.joomall.product.exception;

import com.jaron.common.exception.BizCodeEnum;
import com.jaron.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
// @RestControllerAdvice和@ControllerAdvice的关系类似于@RestController
@RestControllerAdvice(basePackages = "com.jaron.joomall.product.controller")//管理的controller
public class JoomallExceptionControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    public R handleValidException(MethodArgumentNotValidException exception){

        Map<String,String> map=new HashMap<>();
        // 获取数据校验的错误结果
        BindingResult bindingResult = exception.getBindingResult();
        // 处理错误
        bindingResult.getFieldErrors().forEach(fieldError -> {
            String message = fieldError.getDefaultMessage();
            String field = fieldError.getField();
            map.put(field,message);
        });

        log.error("数据校验出现问题{},异常类型{}",exception.getMessage(),exception.getClass());

        return R.error(400,"数据校验出现问题").put("data",map);
    }

    @ExceptionHandler(value = Throwable.class)//异常的范围更大
    public R handleException(Throwable throwable){
        log.error("未知异常{},异常类型{}",
                throwable.getMessage(),
                throwable.getClass());
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(),
                BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}
