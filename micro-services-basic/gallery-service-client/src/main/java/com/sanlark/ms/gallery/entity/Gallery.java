/**
 * @Author: Rajiv Kumar
 * @CreatedDate : 22-May-2019
 */
package com.sanlark.ms.gallery.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gallery {
	private int id;
	private List<Object> images;
	
	public Gallery() {
	}

	public Gallery(int galleryId) {
		this.id = galleryId;
	}
}