@rem  Set the PATH variable to point to your Java JDK location.
@PATH=C:\Program Files\Java\jdk1.8.0_60\bin\;%PATH%
javac.exe -cp ./;renderer_6.jar  %1
java      -cp ./;renderer_6.jar  %~n1
pause
