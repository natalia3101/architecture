public interface iLoginContract {
    interface View {
        void showProgress();
        void hideProgress();
        void showLoginSuccess();
        void showLoginError(String error);
        void showRegistrationSuccess();
        void showRegistrationError(String error);
    }

    interface Presenter {
        void loginUser(String username, String password);
        void registerUser(String username, String password);
        void detachView();
    }
}
