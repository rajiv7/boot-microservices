/**
 * @Author: Rajiv Kumar
 * @CreatedDate : 22-May-2019
 */
package com.sanlark.ms.image.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlark.ms.image.entity.ImageInfo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class HomePageApiController {
	@Autowired
	private Environment env;
	
	static List<ImageInfo> images = Arrays.asList(
			new ImageInfo(101l, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
			new ImageInfo(102l, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
			new ImageInfo(103l, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
	
	@RequestMapping("/images")
	public List<ImageInfo> getImages() {
		log.info(env.toString());
		return images;
	}
	
	@RequestMapping("/images/{id}")
	public ImageInfo getImage(@PathVariable final long id) {
		log.info(env.toString());
		ImageInfo tmp = ImageInfo.builder().id(id).build();
		int tmpIndex = images.indexOf(tmp);
		if(tmpIndex != -1) {
			return images.get(tmpIndex);
		}
		return null;
	}
}