package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.pojo.PictureResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.service.PictureService;

/**
 * 图片上传
 */
@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;

	/**
	 * 图片上传功能
	 */
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String upload(MultipartFile uploadFile) {
//		PictureResult result = pictureService.uploadPicture(uploadFile);
		PictureResult result = pictureService.uploadPictureLocal(uploadFile);
		return JsonUtils.objectToJson(result);
	}
	
}