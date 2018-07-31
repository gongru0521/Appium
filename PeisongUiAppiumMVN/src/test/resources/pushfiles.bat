@echo off 

echo 开始建立移动设备目录

adb shell mkdir -p  /mnt/sdcard/test/appium/docs
adb shell mkdir -p  /mnt/sdcard/test/appium/pics
adb shell mkdir -p  /mnt/sdcard/test/appium/logs

echo 移动设备目录建立结束


echo 正在复制文件
adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\AppiumData.csv  /mnt/sdcard/test/appium/docs

adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\AppiumTestResult.csv  /mnt/sdcard/test/appium/docs

adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\TestData.properties  /mnt/sdcard/test/appium/docs

adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\log4j.properties  /mnt/sdcard/test/appium/docs

echo 复制文件结束





