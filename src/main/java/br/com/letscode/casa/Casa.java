package br.com.letscode.casa;

import lombok.Data;

import java.util.List;

@Data
public class Casa {

    private String id;
    private String name;
    private String animal;
    private String founder;
    private List<Object> values;
}
