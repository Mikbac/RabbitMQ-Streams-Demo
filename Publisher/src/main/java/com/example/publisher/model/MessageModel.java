package com.example.publisher.model;

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

    private String username;
    private String title;

}
