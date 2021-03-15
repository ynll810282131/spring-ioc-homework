package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;

/**
 * @author Treasure baby
 */
public interface ResumeService {

    /**
     * 查询所有
     * @return
     */
    public List<Resume> queryAll();

    /**
     * 添加或者修改
     * @param r
     * @return
     */
    public Resume saveResume(Resume r);

    /**
     * 删除
     * @param id
     */
    public void deleteResume(long id);
}
