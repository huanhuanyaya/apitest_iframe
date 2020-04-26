package api.auto.pojo;

import lombok.Data;

@Data
public class CellData{
    //要写回excel测试结果的数据信息描述
    private int rowNum;
    private int cellNum;
    private String content;


    public CellData(int rowNum, int cellNum, String content) {
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;
    }
}
