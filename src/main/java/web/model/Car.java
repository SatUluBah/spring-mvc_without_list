package web.model;

public class Car {
    private Integer id;
    private String mark;
    private String model;



    public Car(Integer id, String mark, String model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    public Car(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
