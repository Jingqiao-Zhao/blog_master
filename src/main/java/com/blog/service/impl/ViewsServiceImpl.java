package com.blog.service.impl;

import com.blog.dao.ViewsDao;
import com.blog.service.ViewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewsServiceImpl implements ViewsService {

    @Autowired
    private ViewsDao viewsDao;


    @Override

    public int getAllViewsForPeople() {
        int views = viewsDao.getAllViewsForPeople();
        return views;
    }

    @Override
    public int getYesterdayViewsForPeople() {
        return viewsDao.getYesterdayViewsForPeople();
    }

    @Override
    public int getAWeekViewsForPeople() {
        return viewsDao.getAWeekViewsForPeople();
    }

    @Override
    public int getAMonthViewsForPeople() {
        return viewsDao.getAMonthViewsForPeople();
    }

    @Override
    public int getSpanViewsForPeople() {
        return 0;
    }

    @Override
    public void updateViewsForPeople() {
        viewsDao.updateViewsForPeople();
    }
}
