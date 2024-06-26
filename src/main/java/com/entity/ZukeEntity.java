package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 租客
 *
 * @author 
 * @email
 */
@TableName("zuke")
public class ZukeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZukeEntity() {

	}

	public ZukeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 租客姓名
     */
    @TableField(value = "zuke_name")

    private String zukeName;


    /**
     * 租客手机号
     */
    @TableField(value = "zuke_phone")

    private String zukePhone;


    /**
     * 租客身份证号
     */
    @TableField(value = "zuke_id_number")

    private String zukeIdNumber;


    /**
     * 租客头像
     */
    @TableField(value = "zuke_photo")

    private String zukePhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "zuke_email")

    private String zukeEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：租客姓名
	 */
    public String getZukeName() {
        return zukeName;
    }
    /**
	 * 获取：租客姓名
	 */

    public void setZukeName(String zukeName) {
        this.zukeName = zukeName;
    }
    /**
	 * 设置：租客手机号
	 */
    public String getZukePhone() {
        return zukePhone;
    }
    /**
	 * 获取：租客手机号
	 */

    public void setZukePhone(String zukePhone) {
        this.zukePhone = zukePhone;
    }
    /**
	 * 设置：租客身份证号
	 */
    public String getZukeIdNumber() {
        return zukeIdNumber;
    }
    /**
	 * 获取：租客身份证号
	 */

    public void setZukeIdNumber(String zukeIdNumber) {
        this.zukeIdNumber = zukeIdNumber;
    }
    /**
	 * 设置：租客头像
	 */
    public String getZukePhoto() {
        return zukePhoto;
    }
    /**
	 * 获取：租客头像
	 */

    public void setZukePhoto(String zukePhoto) {
        this.zukePhoto = zukePhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getZukeEmail() {
        return zukeEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setZukeEmail(String zukeEmail) {
        this.zukeEmail = zukeEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zuke{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zukeName=" + zukeName +
            ", zukePhone=" + zukePhone +
            ", zukeIdNumber=" + zukeIdNumber +
            ", zukePhoto=" + zukePhoto +
            ", sexTypes=" + sexTypes +
            ", zukeEmail=" + zukeEmail +
            ", createTime=" + createTime +
        "}";
    }
}
