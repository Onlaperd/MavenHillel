package org.example.homework_29;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class POJO {

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonProperty("userId")
    private int userId;

    @JsonProperty("id")
    private int id;


    // зробив метод toString() руками бо мені не подобається реалізація цього метода у lombok
    @Override
    public String toString() {
        return "POJO{" +
                "\ntitle='" + title + '\'' +
                ", \nbody='" + body + '\'' +
                ", \nuserId=" + userId +
                ", \nid=" + id +
                "\n}";
    }
}
