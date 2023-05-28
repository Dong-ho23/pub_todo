package com.example.Todo.dto;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO<T> {
    private String error;
    private List<T> data;
}
// TodoDTO뿐만 아니라 이후 다른 모델의 DTO도 ResponseDTO를 이용해 리턴 가능함