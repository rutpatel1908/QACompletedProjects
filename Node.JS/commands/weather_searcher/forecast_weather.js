const commando = require('discord.js-commando');
const Weather_Searcher_Main = require('../../commands/weather_searcher/weather_searcher_main');

class ForecastWeatherCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: 'forecastweather',
            group: 'weather_searcher',
            memberName: 'forecastweather',
            description: 'Forecasting Weather',
            args: [
                    {
                      key: 'locationname',
                      prompt: 'Please enter the name of the location\n',
                      type: 'string'
                    },
                    {
                      key: 'forecastdays',
                      prompt: 'Please enter the number of days you want the weather forecast for\n',
                      type: 'string'
                    },
		    	  ]
        });
    }

    async run(message, {locationname,forecastdays}){

      const getCurrentWeather = new Weather_Searcher_Main();
      return getCurrentWeather.getForcastedWeather(locationname,forecastdays,(a)=>message.reply(a));
    }

}

module.exports = ForecastWeatherCommand;