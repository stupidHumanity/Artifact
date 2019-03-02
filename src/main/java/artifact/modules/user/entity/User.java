package artifact.modules.user.entity;

import artifact.common.entity.BaseEntity;
import artifact.modules.user.constant.UserState;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User extends BaseEntity implements UserState {
    private String name;
    private String pwd;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
