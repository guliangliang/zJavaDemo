package model.prototype.improve;

import java.io.Serializable;

/**
 * @author liang.gu
 * @date 2020/12/30
 */
public class DeepCloneTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneAge;

    /**
     * 该类
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneAge() {
        return cloneAge;
    }

    public void setCloneAge(String cloneAge) {
        this.cloneAge = cloneAge;
    }
}
