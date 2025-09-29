package com.example.theloginform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.theloginform.ui.theme.TheLoginFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheLoginFormTheme {
                val navController = rememberNavController()
                AppNavHost(navController)
            }
        }
    }
}

// 🔹 Navigation Setup
@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register_customer") { CustomerRegisterScreen(navController) }
        composable("register_mentor") { MentorRegisterScreen(navController) }
    }
}

// 🔹 Login Screen with 2 Buttons
@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome To POS System!", style = MaterialTheme.typography.headlineSmall)

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { navController.navigate("register_customer") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Register as Customer")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("register_mentor") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Register as Mentor")
            }
        }
    }
}

// 🔹 Customer Registration Form
@Composable
fun CustomerRegisterScreen(navController: NavHostController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Add New Customer", style = MaterialTheme.typography.headlineSmall)

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(value = "", onValueChange = {}, label = { Text("First Name") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Last Name") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Phone Number") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Email") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("User Name") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Password") })

            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Confirm Password") })
            Spacer(modifier = Modifier.height(8.dp))

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navController.popBackStack() }) {
                Text("Submit")
            }
        }
    }
}

// 🔹 Mentor Registration Form
@Composable
fun MentorRegisterScreen(navController: NavHostController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Mentor Registration", style = MaterialTheme.typography.headlineSmall)

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(value = "", onValueChange = {}, label = { Text("First Name") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Last Name") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Phone Number") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Email") })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Password") })

            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Confirm Password") })
            Spacer(modifier = Modifier.height(8.dp))



            Button(onClick = { navController.popBackStack() }) {
                Text("Submit")
            }
        }
    }
}
