package com.chill.TopicsAPI.controller;

import com.chill.dao.Topic;
import com.chill.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

@RequestMapping(method = RequestMethod.GET, value="/topics")
   public List<Topic>getAllTopics(){
    return topicService.getAllTopics();
}
    @RequestMapping(method = RequestMethod.GET, value ="/topics/{id}")
    public Topic getById(@PathVariable String id){
        return topicService.getByTopicId(id);
    }
    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
    topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
    topicService.setTopic(topic, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/topics")
    public void deleteTopic(@PathVariable @RequestBody Topic topic){
    topicService.deleteTopic(topic);
    }
}