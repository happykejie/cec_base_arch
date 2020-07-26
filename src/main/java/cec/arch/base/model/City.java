package cec.arch.base.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 市级信息
 * </p>
 *
 * @author zj
 * @since 2020-07-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class City extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String state;


}
