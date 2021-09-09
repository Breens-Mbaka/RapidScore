<p align="center">
  <img src="/images/swiftscorelogo.png" width="40%" height="40%"/>
</p>

# SwiftScore

A football stats and livescore app built with Kotlin,MVVM architecture,Retrofit, Coroutines and Navigation Components

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


## Screenshots

  <p align="center">
<img src="/images/upcomingmatches.png" width="40%"/> 
<img src="/images/pastscores.png" width="40%"/> 
<img src="/images/leaguetable.png" width="40%"/>
<img src="/images/topscorers.png" width="40%"/>
</p>

## Demo)

<div style="width:360px;max-width:100%;"><div style="height:0;padding-bottom:211.11%;position:relative;"><iframe width="360" height="760" style="position:absolute;top:0;left:0;width:100%;height:100%;" frameBorder="0" src="https://imgflip.com/embed/5mfu1z"></iframe></div><p><a href="https://imgflip.com/gif/5mfu1z">via Imgflip</a></p></div>
