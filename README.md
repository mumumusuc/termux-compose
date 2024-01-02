## Jetbrains Compose on Termux

|<img src="https://raw.githubusercontent.com/mumumusuc/termux-compose/main/image/compose-desktop.jpg" alt="desktop"/>|<img src="https://raw.githubusercontent.com/mumumusuc/termux-compose/main/image/compose-android.jpg" alt="android"/>|<img src="https://raw.githubusercontent.com/mumumusuc/termux-compose/main/image/compose-wasm.jpg" alt="wasm"/>|
| :-----: | :-----: | :----: |
| desktop | android |  wasm  |

---

### Desktop
  - install [Termux:X11](https://github.com/termux/termux-x11/releases/tag/nightly)
  - run
    ```bash
    export DISPLAY=:0 && termux-x11 :0 >/dev/null 2>&1 &
    ./gradlew run
    ```
  - open *Termux:X11*

### Android
  - install [android-sdk](https://github.com/mumumusuc/termux-android-sdk/releases/tag/30.0.3)
  - build
    ```bash
    ./gradlew assembleDebug
    ```
  - install apk

### Wasm
  - check [browser compatibility](https://github.com/Kotlin/kotlin-wasm-examples/tree/main/compose-imageviewer#setup-environment)
  - run
    ```bash
    ./gradlew wasmJsBrowserRun
    ```
  - open browser with `localhost:8080`
