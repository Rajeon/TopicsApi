package com.chill.service;

import com.chill.dao.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicService topicService;


     List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("spring", "spring framework ", "spring framework description"),
                new Topic("java", "Core Java ", "Core Java description"),
                new Topic("angular", "Angualar 8", "Angualar 8 description")
        ));

        public List<Topic> getAllTopics(){
            return topics;
        }
//        Get a topic/loop through topic
        public Topic getByTopicId(String id){
//        inside the loop check if the topic has that id
//          loop through list of topics and get the id that matches then return it
            for(int x = 0; x < topics.size(); x++){
                if(topics.get(x).getId().equals(id)){

                    return topics.get(x);
                }
            }
            return null;
        }

        public void addTopic(Topic topic){
            topics.add(topic);
        }
//      Write a Business that service that update a topic
    public Topic setTopic(Topic topic, String id) {
            for (int x = 0; x < topics.size(); x++){
                if(topics.get(x).getId().equals(id)){
                    return topics.set(x,topic);
                }

            }
        return topic;
    }
    public void deleteTopic(Topic topic){
            for (int x = 0; x < topics.size(); x++){
                if(topics.remove(x).getId().equals(topic.getId())){
                    System.out.println(x);
                }
            }
    }

    }






