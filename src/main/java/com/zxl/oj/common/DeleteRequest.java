package com.zxl.oj.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * ROSE
 * @from ROSE
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
