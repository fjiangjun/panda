package com.minister.panda.web;

import com.minister.panda.exception.Errorinfo;
import com.minister.panda.exception.MyException;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/8
 */
@ControllerAdvice
public class GlobalExceptionHandler {
//    public static final String DEFAULT_ERROR_VIEW = "error";
//
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception",e);
//        mav.addObject("url",req.getRequestURL());
//        mav.setViewName(DEFAULT_ERROR_VIEW);
//        return mav;
//    }


    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Errorinfo<String> jsonErrorHandler(HttpServletRequest req,MyException e) throws Exception{
        Errorinfo<String> r = new Errorinfo<>();
        r.setMessage(e.getMessage());
        r.setCode(Errorinfo.ERROR);
        r.setData("some data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
