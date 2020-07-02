package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("spring","Spring Framework","Spring FrameWork Discrption"),
                new Topic("java","core java","Java Discrption"),
                new Topic("javascript","Java Script","Java Script Discrption")
        );
    }
}
