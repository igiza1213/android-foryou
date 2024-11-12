package com.example.android_foryou.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.android_foryou.R
import com.example.android_foryou.navigation.Screens
import com.example.android_foryou.ui.widget.AuthButton

@Composable
fun SignupDetailScreen(navController: NavController) {

    var gender by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var birth by remember { mutableStateOf("") }

    val childCheckedStates = remember { mutableStateListOf(false, false) }

    val parentState = when {
        childCheckedStates.all { it } -> ToggleableState.On
        childCheckedStates.none { it } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .width(37.dp)
                        .height(34.dp)
                )
                Text(
                    text = "회원가입",
                    fontSize = 18.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Column {
                Text(text = "세부정보", modifier = Modifier)


                Divider(thickness = 2.dp, modifier = Modifier.padding(top = 15.dp))
            }

            OutlinedTextField(
                modifier = Modifier.width(300.dp),
                value = gender,
                onValueChange = { gender = it },
                label = { Text(text = "성별") })

            OutlinedTextField(
                modifier = Modifier.width(300.dp),
                value = age,
                onValueChange = { age = it },
                label = { Text(text = "나이") })

            OutlinedTextField(
                modifier = Modifier.width(300.dp),
                value = birth,
                onValueChange = { birth = it },
                label = { Text(text = "생일") })

            Divider(thickness = 2.dp, modifier = Modifier.padding(top = 15.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(29.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text("Select all")
                    TriStateCheckbox(
                        state = parentState,
                        onClick = {
                            // Determine new state based on current state
                            val newState = parentState != ToggleableState.On
                            childCheckedStates.forEachIndexed { index, _ ->
                                childCheckedStates[index] = newState
                            }
                        }
                    )
                }
                childCheckedStates.forEachIndexed { index, checked ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(if (index == 0) "[필수] 이용약관 동의" else "[필수] 개인정보 수집 및 이용 동의")
                        Checkbox(
                            checked = checked,
                            onCheckedChange = { isChecked ->
                                // Update the individual child state
                                childCheckedStates[index] = isChecked
                            }
                        )
                    }
                }
            }

            AuthButton(text = "Next", onClick = {
                navController.navigate(Screens.Home.title)
            })

        }
    }
}

@Preview
@Composable
fun SignupDetailPreView() {
    SignupDetailScreen(navController = rememberNavController())
}