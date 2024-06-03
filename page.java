<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>World Clock</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        .clock {
            font-size: 24px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <h1>World Clock</h1>
    <div class="clock" id="new-york-clock"></div>
    <div class="clock" id="london-clock"></div>
    <div class="clock" id="bangkok-clock"></div>
    <div class="clock" id="berlin-clock"></div>

    <script>
        // Function to update the date and time of a specific timezone
        function updateClock(timezone, elementId) {
            var now = new Date();
            var options = { timeZone: timezone };
            var dateTimeString = now.toLocaleString('en-US', options);
            document.getElementById(elementId).textContent = dateTimeString;
        }

        // Call the updateClock function initially to display the date and time immediately
        updateClock('America/New_York', 'new-york-clock');
        updateClock('Europe/London', 'london-clock');
        updateClock('Asia/Bangkok', 'bangkok-clock');
        updateClock('Europe/Berlin', 'berlin-clock');

        // Update the date and time every second
        setInterval(function() {
            updateClock('America/New_York', 'new-york-clock');
            updateClock('Europe/London', 'london-clock');
            updateClock('Asia/Bangkok', 'bangkok-clock');
            updateClock('Europe/Berlin', 'berlin-clock');
        }, 1000);
    </script>
</body>
</html>