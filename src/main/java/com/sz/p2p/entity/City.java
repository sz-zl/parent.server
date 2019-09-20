package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 城市表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_city")
public class City extends Model<City> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 城市表ID
     */
    @TableId(value = "CITY_NO", type = IdType.AUTO)
    private Double cityNo;
    /**
     * 城市编号
     */
    private Double cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 城市级别 (0：省 ；1：市；2：县)
     */
    private String ctiyGrade;
    /**
     * 父级城市编号
     */
    private String parentCityId;


    public Double getCityNo() {
        return cityNo;
    }

    public void setCityNo(Double cityNo) {
        this.cityNo = cityNo;
    }

    public Double getCityId() {
        return cityId;
    }

    public void setCityId(Double cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCtiyGrade() {
        return ctiyGrade;
    }

    public void setCtiyGrade(String ctiyGrade) {
        this.ctiyGrade = ctiyGrade;
    }

    public String getParentCityId() {
        return parentCityId;
    }

    public void setParentCityId(String parentCityId) {
        this.parentCityId = parentCityId;
    }

    @Override
    protected Serializable pkVal() {
        return this.cityNo;
    }

    @Override
    public String toString() {
        return "City{" +
        ", cityNo=" + cityNo +
        ", cityId=" + cityId +
        ", cityName=" + cityName +
        ", ctiyGrade=" + ctiyGrade +
        ", parentCityId=" + parentCityId +
        "}";
    }
}
