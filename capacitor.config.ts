import { CapacitorConfig } from "@capacitor/cli";

const config: CapacitorConfig = {
  "appId": "com.e2ebug",
  "appName": "e2ebug",
  "webDir": "dist",
  "plugins": {
    "SplashScreen": {
      "launchShowDuration": 0,
      "launchAutoHide": true,
    },
  },
  "android": {
    "allowMixedContent": true,
  },
};

export default config;
