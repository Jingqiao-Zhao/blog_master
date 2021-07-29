package com.blog;

import com.blog.service.BlogService;
import com.blog.service.ViewsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ViewsServiceTest {

    @Autowired
    private ViewsService viewsService;


    @Test
    public void test(){
        int a = viewsService.getAllViewsForPeople();
        System.out.println(a);
        System.out.println(viewsService.getYesterdayViewsForPeople());
        System.out.println(viewsService.getAWeekViewsForPeople());
        viewsService.updateViewsForPeople();
    }

}
