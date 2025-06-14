# 📤 off.tiktok — No Account? No Problem!

Ever tried clicking a TikTok link only to be met with a giant wall asking you to **"Log in to view this content"**?  
Well, not anymore. Meet `off.tiktok` — the tiniest app with the biggest middle finger to unnecessary logins.

---

## 🎯 What It Does

You share a TikTok link.  
We slap some sense into it.  
Your browser opens the **offtiktok.com** version — no login, no problem, just smooth ~stalking~ viewing.

---

## 🔥 Features

- 🦑 No launcher icon — it hides in the shadows like a ninja.
- 🔧 Modifies TikTok URLs with surgical precision (finds `tiktok`, swaps with `offtiktok`).
- 🌐 Launches your browser like a boss.
- 💾 So small, you might lose it on your phone.

---

## 🛠 How To Use

1. Tap that share button on any TikTok video.
2. Choose **off.tiktok** from the share sheet.
3. We do our magic.
4. Enjoy the video like it’s 2010 and nobody cared about accounts.

---

## 🚫 What It Doesn't Do

- It doesn't steal your data (we wouldn’t even know where to put it).
- It doesn’t work on anything that's not a TikTok link.  
  We’re specialized like that. (if you want other social media you can open an issue)

---

## 👻 Permissions

None. Zero. Zilch.  
We don’t need to know your location to make fun of social media walls.

---

## 📦 Building and installing with ADB

```bash
git clone https://github.com/your-username/off.tiktok.git
cd off.tiktok
./gradlew assembleDebug
adb install app/build/outputs/apk/debug/app-debug.apk