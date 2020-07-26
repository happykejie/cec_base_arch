package cec.arch.base.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 国家信息
 * </p>
 *
 * @author zj
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Country extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 名称
     */
    private String countryname;

    /**
     * 代码
     */
    private String countrycode;


}
