package com.example.springcloudpractice.impl;

import com.example.springcloudpractice.dao.person;
import com.example.springcloudpractice.pack.learning;
import com.example.springcloudpractice.pack.motion;
import lombok.Data;


@Data
public class student extends person implements learning, motion
{
    public void say()
    {
        System.out.println("name:"+name+","+"age:"+age);
    }

    @Override
    public void Read() {
        System.out.println("I Reading");
    }

    @Override
    public void Jump()
    {
        System.out.println("I am basketball");
    }
}
