package com.blog.util;

import com.blog.service.ViewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
@Component
public class Listener implements HttpSessionListener {

    @Autowired
    private ViewsService viewsService;

    @Override
    public void sessionCreated(HttpSessionEvent se) {

        // 每出现一个新用户进行一次刷新
        viewsService.updateViewsForPeople();
        // 设置session过期时间，单位为秒
        se.getSession().setMaxInactiveInterval(60);

    }


}
