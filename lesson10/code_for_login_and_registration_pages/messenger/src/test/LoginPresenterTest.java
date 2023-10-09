package test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class LoginPresenterTest {

    @Mock
    private iLoginContract.View mockView;

    private LoginPresenter presenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new LoginPresenter(mockView);
    }

    @Test
    public void testLoginUserSuccess() {
        // Моделируем успешный вход пользователя
        presenter.loginUser("exampleUser", "password");

        // Проверяем, что представление вызвало методы для показа успешного входа
        verify(mockView).showProgress();
        verify(mockView).hideProgress();
        verify(mockView).showLoginSuccess();
    }

    @Test
    public void testLoginUserError() {
        // Моделируем ошибку входа пользователя
        presenter.loginUser("invalidUser", "wrongPassword");

        // Проверяем, что представление вызвало методы для показа ошибки входа
        verify(mockView).showProgress();
        verify(mockView).hideProgress();
        verify(mockView).showLoginError("Ошибка входа");
    }

    @Test
    public void testRegisterUserSuccess() {
        // Моделируем успешную регистрацию пользователя
        presenter.registerUser("newUser", "password123");

        // Проверяем, что представление вызвало методы для показа успешной регистрации
        verify(mockView).showProgress();
        verify(mockView).hideProgress();
        verify(mockView).showRegistrationSuccess();
    }

    @Test
    public void testRegisterUserError() {
        // Моделируем ошибку регистрации пользователя
        presenter.registerUser("existingUser", "password123");

        // Проверяем, что представление вызвало методы для показа ошибки регистрации
        verify(mockView).showProgress();
        verify(mockView).hideProgress();
        verify(mockView).showRegistrationError("Пользователь уже существует");
    }
}

