package quanlythuvien;

public class quanlytacgia {
    private String name;
    private String id;
    private int age;

    public quanlytacgia(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void author() {
        System.out.println("Name author:" + name + "||___ID author:" + id + "||___Age author:" + age);
    };

}

