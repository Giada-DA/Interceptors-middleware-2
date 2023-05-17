package co.develhope.interceptorsmiddleware2.controllers;

import co.develhope.interceptorsmiddleware2.entities.Month;
import co.develhope.interceptorsmiddleware2.interceptors.MonthInterceptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MonthController {

    @GetMapping("/month")
	public Month returnMonth(HttpServletRequest request){
		return (Month)request.getAttribute("month");
	}

}

//@GetMapping
//	public Month returnMonth(HttpServletRequest request){
//		return (Month)request.getAttribute("month");
//	}

/*
@GetMapping("/month/{monthNumber}")
public Month getMonth(@PathVariable int monthNumber){
    return new MonthInterceptor().getMonth(monthNumber);
}

 */