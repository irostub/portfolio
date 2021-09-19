import fullpage from 'fullpage.js'

var myFullpage = new fullpage('#fullpage', {
  licenseKey: '75CCC562-E65645AD-AD246452-83704190',
  anchors:['firstPage', 'secondPage', 'thirdPage'],
  navigation: true,
  navigationPosition: 'left',
  sectionsColor: ['#f2f2f2', '#4BBFC3', '#7BAABE', 'whitesmoke', '#ccddff']
});
