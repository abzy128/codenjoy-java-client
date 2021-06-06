if "%JAVA_CLIENT_HOME%"=="" (
    call 0-settings.bat
)

echo off
echo [44;93m
echo        +-------------------------------------------------------------------------+        
echo        !                 Now we are starting java client...                      !
echo        +-------------------------------------------------------------------------+        
echo [0m
echo on

chcp %CODE_PAGE%
cls

call mvnw exec:java -Dfile.encoding=UTF-8 -D"exec.mainClass"="com.codenjoy.dojo.Runner" -D"exec.args"="%GAME_TO_RUN% %BOARD_URL%"

call :ask

goto :eof

:ask
    echo Press any key to continue
    pause >nul
goto :eof