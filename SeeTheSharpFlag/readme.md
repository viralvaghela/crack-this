## See The Sharp Flag
link to the challenge: https://app.hackthebox.com/challenges/241 

### Description:
Downloaded the apk file and decompiled it using jadx-gui.

Opened it in nox emulator and started the app.

![app](/SeeTheSharpFlag/screenshots/Screenshot%20(25).png)

We get message "Sorry, Not correct password". when the secret is invalid.

Then opened the apk file in jadx-gui and searched for the string "Sorry, Not correct password", "CLICK" etc keywords, couldt find anything. 

App is built using Xamarin, so we can use dnSpy to decompile the dll files. 

I Found these .dll files in the apk file. 
![dll](/SeeTheSharpFlag/screenshots/Screenshot%20(26).png)

I opened the dll files in dnSpy. it didnt work, so i tried to open, it has a file header called XALZ

![dll](/SeeTheSharpFlag/screenshots/Screenshot%20(27).png)

I googled about XALZ and found this script to decompress the .dll files 

https://github.com/x41sec/tools/blob/master/Mobile/Xamarin/Xamarin_XALZ_decompress.py

Thanks to https://github.com/x41sec for the script :)

I ran the script and got the decompressed dll files.
and now i can open the dll files in dnSpy. as you can see the screenshot below.

![dll](/SeeTheSharpFlag/screenshots/Screenshot%20(28).png)