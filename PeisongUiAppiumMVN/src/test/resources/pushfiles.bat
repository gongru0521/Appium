@echo off 

echo ��ʼ�����ƶ��豸Ŀ¼

adb shell mkdir -p  /mnt/sdcard/test/appium/docs
adb shell mkdir -p  /mnt/sdcard/test/appium/pics
adb shell mkdir -p  /mnt/sdcard/test/appium/logs

echo �ƶ��豸Ŀ¼��������


echo ���ڸ����ļ�
adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\AppiumData.csv  /mnt/sdcard/test/appium/docs

adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\AppiumTestResult.csv  /mnt/sdcard/test/appium/docs

adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\TestData.properties  /mnt/sdcard/test/appium/docs

adb push F:\workspace\PeisongUiAppiumMVN\src\test\resources\log4j.properties  /mnt/sdcard/test/appium/docs

echo �����ļ�����





