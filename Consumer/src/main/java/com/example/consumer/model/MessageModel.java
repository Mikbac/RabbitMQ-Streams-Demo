package com.example.consumer.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

/**
 * Created by MikBac on 28.11.2022
 */

@Data
public class MessageModel {

    @JsonDeserialize
    private String username;
    @JsonDeserialize
    private String title;

}
