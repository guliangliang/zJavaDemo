package model.principle.lsp.improve;

/**
 * @author liang.gu
 * @date 2020/12/29
 */
public class B extends Base{
    //如果B需要使用A的方法，是组合关系
    private A aa = new A();

    public int fuc2(int a,int b){
        return aa.fuc1(a,b)+10;
    }

}
