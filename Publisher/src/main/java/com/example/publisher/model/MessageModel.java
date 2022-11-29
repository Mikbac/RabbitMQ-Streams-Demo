package com.example.publisher.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by MikBac on 28.11.2022
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {

    @JsonSerialize
    private String username;
    @JsonSerialize
    private String title;

}
