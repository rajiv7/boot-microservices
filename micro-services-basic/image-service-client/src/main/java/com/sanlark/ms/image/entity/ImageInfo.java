/**
 * @Author: Rajiv Kumar
 * @CreatedDate : 22-May-2019
 */
package com.sanlark.ms.image.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(exclude= {"name", "url"})
public class ImageInfo {
	private long id;
	private String name;
	private String url;
}