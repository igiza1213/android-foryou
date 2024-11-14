# Android-foryou

Foryou

## Project Tree

```
main
├─ AndroidManifest.xml
└─ java
   └─ com.example.android_foryou
      ├─ MainActivity.kt
      ├─ navigation
      │  ├─ AppNavigation.kt
      │  └─ Screens.kt
      ├─ screens
      │  ├─ home
      │  │  ├─ HomeData.kt
      │  │  ├─ HomeModel.kt
      │  │  └─ HomeScreen.kt
      │  ├─ signin
      │  │  └─ SignInScreen.kt
      │  ├─ signupDetail
      │  │  └─ SignupDetailScreen.kt
      │  └─ signupInfo
      │     └─ SignupInfoScreen.kt
      └─ ui
         ├─ theme
         │  ├─ Color.kt
         │  ├─ Theme.kt
         │  └─ Type.kt
         └─ widget
            └─ authButton.kt
```

- navigation폴더: 앱 네비게이터와 스크린 주소 정의
- screens폴더: 각 화면들 구성 파일
- ui폴더: 프로젝트 widget및 테마
- MainActivity.ki: 앱 진입점

앱시작 > MainActivity.kt > Navigation/AppNavigaion.kt > 각 화면 구성 파일 (screens)
