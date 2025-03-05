import React from "react";
import { GithubFilled } from "@ant-design/icons";
import "./index.css";

/**
 * 全局底部栏组件
 * @constructor
 */
export default function GlobalFooter() {

  return (
    <div className="global-footer">
    
      <div>
        <a href="https://github.com/LiX-u" target="_blank">
          <GithubFilled style={{ fontSize: '24px', color: '#000', marginRight: '10px' }} />
        </a>
        面基_面试基础刷题平台
      </div>
      <div>
        <a href="http://lix-v.cn/jianli" target="_blank">
          李旭_25届本科毕业
        </a>
      </div>
    </div>
  );
}
