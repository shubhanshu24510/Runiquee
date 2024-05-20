# Runique

Runique is a multi-module running tracker apps that monitors health and running data tracks with current location and is available on both mobile devices and Wear OS platforms.

![Run Feature](https://pl-coding.com/wp-content/uploads/2024/04/run-feature.png)
<table>
  <tr>
    <td>
      <img src="https://pl-coding.com/wp-content/uploads/2024/04/auth-feature.png" alt="Auth Feature" width="500"/>
    </td>
    <td>
      <img src="https://pl-coding.com/wp-content/uploads/2024/04/phone-watch-mockup.png" alt="Phone Watch Mockup" width="300"/>
    </td>
  </tr>
</table>

- Multi-module architecture
- Authentication systems (OAuth / token refresh)
- Offline-first development
- Dynamic feature modules
- Google Maps SDK
- Jetpack Compose in multi-module projects
- Wear OS development (Health services API, data sync, UI building)

## How do you run the project?

In order to run the project on your phone, you'll need to first clone it and then add two API keys for:
1. ... the Runique API (access granted after course purchase)
2. ... Google Maps (needs to be got from Google Cloud Console - instructions in the course)

Then simply include them in `local.properties`:
```
API_KEY=<RUNIQUE_API_KEY>
MAPS_API_KEY=<GOOGLE_MAPS_API_KEY>
```
Afterwards, build the project and you're ready to use it.
