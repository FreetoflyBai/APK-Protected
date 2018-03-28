# APK Protected

   This is a library of encrypt apk . Include encrypt dex、proguard resource、signature verification

## Usage

注意：所有参数配置均在gradle.properties文件中
          输入源apk与keystore默认放置在工程根目录，使用相对路径获取（../）

1. gradle modifyPackagePath </br></br>
    PACKAGE_PATH 指原来壳项目包路径(app模块)</br>
    APPLICATION_ID 指修改后目标路径</br>

    如果手动修改壳项目包路径，请同时修改以下内容：</br>
        - 修改jni中包路径对应字符串（.cpp .h）</br>
        - 修改lib模块中JiaGu.java中变量PROXY_APPLICATION_NAME的值</br></br>

2. gradle clean build</br></br>
    编译app模块，生成apk文件，用来制作壳文件</br></br>


3. gradle zipToShell</br></br>
    将apk文件打包成壳文件（jiagu.zip）</br></br>

4. gradle zipToApk</br></br>
    加固apk</br></br>


总结：
     组合命令：gradle modifyPackagePath clean build zipToShell zipToApk
