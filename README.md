# SwiftScore

### Screenshots
<p align="left">
<img src="/images/upcomingmatches.png" width="30%"/> 
<img src="/images/pastscores.png" width="30%"/> 
<img src="/images/leaguetable.png" width="30%"/>
<img src="/images/topscorers.png" width="30%"/>
<img src="https://user-images.githubusercontent.com/72180010/134592296-38da230c-89d7-4e75-8558-62833acdb60b.gif" width="50%" height="800px"/>
</p>

---

### Table of Contents

- [Description](#description)
- [Dependencies](#dependencies)
- [API Reference](#api-reference)
- [Lessons Learnt](#lesssons-learnt)
- [Contributing](#contributing)
- [Roadmap](#roadmap)
- [Google Playstore](google-playstore)
- [License](#license)
- [Author Info](author-info)

---

## Description

* A simple football stats and live-score Android app
* A user can select a league they want to view the league table, top scorers and also be updated on the live-scores in realtime
* User can be able to select to see upcoming matches for a given day
* Project was completed with MVVM architecture and following android app architecture using Retrofit , Coroutines and Navigation components

### Dependencies
* Coroutines
* Retrofit
* Navigation components
* Glide
* GlideVectorYou

### API Reference

#### Get upcoming matches

```https
  GET /api/v1/soccer/matches
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `apiKey` | `string` | **Required**. Your API key |
| `seasonId` | `string` | **Required**.League Id e.g Premier League|
| `dateFrom` | `string` | **Required**.|
| `dateTo` | `string` | **Required**.|

#### Get League Table

```https
  GET /api/v1/json/1/lookuptable.php
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `l`      | `string` | **Required**. League Id e.g 1980 for Premier League |
| `s`      | `string` | **Required**. League Season Id e.g 2021-2022 |

#### Get Top Scorers

```https
  GET /api/v1/soccer/topscorers
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `l`      | `string` | **Required**. League Id e.g 1980 for Premier League |
| `s`      | `string` | **Required**. League Season Id e.g 2021-2022 |

### Lesssons Learnt

- Always perform heavy tasks like local database and network operations on the background thread. This is to prevent blocking the main thread, I used Retrofit for network operation in support of Coroutines to perform the task in the background thread.

- Navigation components made it easy for me to build my app's navigation system. Learnt best practices like having one activity and multiple fragments that can be swaped in and out of the fragment container, this improved app responsiveness since fragments are lightweight

- Learnt how to create UI designs on Figma this really came in handy since without me knowing I was always thinking on the architecture of the app and how the data will flow

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Roadmap
```
  Intergrate offline caching using Room local database
```
```
  Add multiple leagues like La Liga, Serie A(Ligue 1 now intergrated in version 1.1.1)
```

## Google Playstore

<p align="left">
    <a href="https://play.google.com/store/apps/details?id=com.swift.swiftscore">
        <img src="/images/googleplaylogo.png" width="40%" height="40%"/>
    </a>
</p>

## License

[MIT](https://choosealicense.com/licenses/mit/)

## Author Info

- Twitter - [@BreensR](https://twitter.com/BreensR)
- Linkedin - [LinkedIn: Breens Mbaka](https://www.linkedin.com/in/breens-mbaka-b447781b9/)
