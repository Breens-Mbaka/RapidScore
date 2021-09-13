<p align="center">
  <img src="/images/swiftscorelogo.png" width="40%" height="40%"/>
</p>

# SwiftScore

A football stats and livescore app built with Kotlin,MVVM architecture,Retrofit, Coroutines and Navigation Components

## Demo

![5mfwtt](https://user-images.githubusercontent.com/72180010/132879117-fa102f6c-8280-45e8-a244-f7d048ccf693.gif)


## Screenshots


<p align="left">
<img src="/images/upcomingmatches.png" width="30%"/> 
<img src="/images/pastscores.png" width="30%"/> 
<img src="/images/leaguetable.png" width="30%"/>
<img src="/images/topscorers.png" width="30%"/>
</p>

## API Reference

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

## Lesssons Learnt

- Always perform heavy tasks like local database and network operations on the background thread. This is to prevent blocking the main thread, I used Retrofit for network operation in support of Coroutines to perform the task in the background thread.

- Navigation components made it easy for me to build my app's navigation system. Learnt best practices like having one activity and multiple fragments that can be swaped in and out of the fragment container, this improved app responsiveness since fragments are lightweight

- Learnt how to create UI designs on Figma this really came in handy since without me knowing I was always thinking on the architecture of the app and how the data will flow

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request to development` branch and we are good to go!

## Roadmap
```
  Intergrate offline caching using Room local database
```
```
  Add multiple leagues like La Liga, Serie A, Ligue 1 etc
```

## License

[MIT](https://choosealicense.com/licenses/mit/)

## Support

For support, email mbakabreens@gmail.com
